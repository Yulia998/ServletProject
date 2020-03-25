package test.controller.processors;

import test.model.ProcessorResult;

import javax.servlet.http.HttpServletRequest;

public class ProcessMainPage extends Processor {
    public ProcessMainPage() {
        action = "mainPage";
    }

    @Override
    public ProcessorResult getResult(HttpServletRequest request) {
        String userName = request.getParameter("userName");
        request.getSession().setAttribute("userName", userName);
        return new ProcessorResult("/main", null, true);
    }
}
