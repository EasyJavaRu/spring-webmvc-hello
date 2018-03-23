package ru.easyjava.spring.webmvc.helloservlet;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Example of a Spring WebMVC controller.
 */
@Controller
public final class HelloController {

    /**
     * Greeting function.
     * @param name Who to greet.
     * @return Formatted greeting string.
     */
    private String formatGreet(final String name) {
        return String.format("Hello, %s", name);
    }

    /**
     * Example of web handler method.
     * @param name Name of person to be greeted.
     * @return Greeting string.
     */
    @GetMapping("/hello")
    @ResponseBody
    public String greet(@RequestParam("name") final String name) {
        if (StringUtils.isEmpty(name)) {
            return formatGreet("Anonymous");
        }
        return formatGreet(name);
    }
}
