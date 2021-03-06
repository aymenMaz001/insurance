package tn.esprit.managedbean;

import java.io.File;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;
import org.alicebot.ab.History;
import org.alicebot.ab.MagicBooleans;
import org.alicebot.ab.MagicStrings;

import tn.esprit.insurance.entity.Premium;
import tn.esprit.insurance.service.implementation.Feedbacks;
import tn.esprit.insurance.service.implementation.PremiumService;

@ManagedBean
public class ChatBotBean {

    private static final boolean TRACE_MODE = false;
    static String botName = "super";
    
    private String msg;
    private String resp;

    
    @EJB
    PremiumService pr;
    
    public float getPremium(Long id){
    	return pr.findPrimeById(id).getValue();
    }
    
	public String getResp() {
		return resp;
	}

	public void setResp(String resp) {
		this.resp = resp;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void chatb(){
        try {
            String resourcesPath = getResourcesPath();
            System.out.println(resourcesPath);
            MagicBooleans.trace_mode = TRACE_MODE;
            Bot bot = new Bot("super", resourcesPath);
            Chat chatSession = new Chat(bot);
            bot.brain.nodeStats();
            String textLine = "";
            
            textLine = this.msg;
            if ((textLine == null) || (textLine.length() < 1))
                textLine = MagicStrings.null_input;
            if (textLine.toUpperCase().contains("I AM PAYING")) {
                this.setResp("Botty : You are paying as a prime: " + getPremium(1L)+ " DT");
            }else if (textLine.toUpperCase().contains("COST ME")) {
                    this.setResp("Botty : <a href='simulator1.jsf'>Click here</a> ");
            } else if (textLine.equals("wq")) {
                bot.writeQuit();
                System.exit(0);
            } else {
                String request = textLine;
                if (MagicBooleans.trace_mode)
                    System.out.println("STATE=" + request + ":THAT=" + ((History) chatSession.thatHistory.get(0)).get(0) + ":TOPIC=" + chatSession.predicates.get("topic"));
                String response = chatSession.multisentenceRespond(request);
                while (response.contains("&lt;"))
                    response = response.replace("&lt;", "<");
                while (response.contains("&gt;"))
                    response = response.replace("&gt;", ">");  
                
                this.setResp("Botty : " + response);
//                System.out.println("Robot : " + response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    private static String getResourcesPath() {
        File currDir = new File(".");
        String path = currDir.getAbsolutePath();
        path = path.substring(0, path.length() - 2);
        System.out.println(path);
        String resourcesPath = path + File.separator + "src" + File.separator + "main" + File.separator + "resources";
        return resourcesPath;
    }
}
