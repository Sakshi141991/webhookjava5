package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

import org.json.JSONObject;
@Controller
@RequestMapping("/webhook")
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody WebhookResponse webhook(@RequestBody String obj){
         //String n="Sakshi";
         //JSONObject obj1=new JSONObject();
         //String n=obj1.getString("result");
    	Date d=new Date();
    	
         return new WebhookResponse("Hello! " + d, "Text " + obj);
    }//webhookResponse
}
