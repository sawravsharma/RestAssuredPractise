package UsingPojoSerialization;

import io.restassured.mapper.ObjectMapper;

public class FinalPayload {
    public static void main(String[] args) {
        IssueType issueType = new IssueType("Task");
        Projects projects = new Projects("Rest");
        Payload p = new Payload("Demo1", "Demo1 Description", issueType, projects);
        Fields f = new Fields(p);

        ObjectMapper objMap = new ObjectMapper() {
        String mydata = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(f);
        System.out.println(mydata);

        }
    }
}
