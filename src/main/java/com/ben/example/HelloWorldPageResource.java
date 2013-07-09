package com.ben.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: ben
 * Date: 7/7/13
 * Time: 9:18 PM
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("hello")
public class HelloWorldPageResource {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String returnHelloWorldString() {
        return "BEST WEBPAGE EVAR";
    }

    @RequestMapping(value="world", method = RequestMethod.GET)
    public String returnHelloWorldTemplate() {
        return "someTemplate";
    }

}
