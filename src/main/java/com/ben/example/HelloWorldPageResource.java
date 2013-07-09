package com.ben.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ben
 * Date: 7/7/13
 * Time: 9:18 PM
 * To change this template use File | Settings | File Templates.
 */

//We tell Spring that this is a controller.  This actually isn't enough, we also have to tell mvc-dispatcher-servlet.xml to scan for components here.
@Controller
//All methods in this class are implicitly bound below localhost:8080/hello
@RequestMapping("hello")
public class HelloWorldPageResource {

    //For this example, we don't want a sub-url, so we don't specify a value.  Just that all requests will be GETs.
    @RequestMapping(method = RequestMethod.GET)
    //ResponseBody means don't look for a template, just return the exact String I'm asking for.
    // Check this out with localhost:8080/hello
    @ResponseBody
    public String returnHelloWorldString() {
        return "BEST WEBPAGE EVAR";
    }

    //Here, we want to be listed at localhost:8080/hello/world, and we want the variable 'name' in the template to be 'Ben'.
    //Since we didn't use the RequestBody annotation, spring knows that someTemplate is a template.  There is some configuration
    // in mvc-dispatcher-servlet.xml that tells spring what file extension and folder to use.
    @RequestMapping(value="world", method = RequestMethod.GET)
    public String returnHelloWorldTemplate(ModelMap model) {
        model.addAttribute("name", "Ben");
        return "someTemplate";
    }

    //Just for fun, here we take in a path parameter, and set the name to that.  To use this, try going to localhost:8080/hello/_____
    // just put any name in the blank!
    @RequestMapping(value="{aName}", method = RequestMethod.GET)
    public String returnHelloWorldTemplateWithPathName(ModelMap model, @PathVariable String aName) {
        model.addAttribute("name", aName);
        return "someTemplate";
    }

}
