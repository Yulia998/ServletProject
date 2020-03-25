package test.controller.processors;

import test.dao.OracleDaoConnection;
import test.model.ProcessorResult;
import test.model.Student;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class ProcessorShowAllStudents extends Processor {
    public ProcessorShowAllStudents() {
        action = "showAllStudents";
    }

    @Override
    public ProcessorResult getResult(HttpServletRequest request) {
        OracleDaoConnection oracleDaoConnection = OracleDaoConnection.getInstance();
        List<Student> studentList = oracleDaoConnection.selectAllStudents();
        request.getSession().setAttribute("studentList", studentList);
        return new ProcessorResult("/main", "/page/showAllStudents.jsp", true);
    }
}
