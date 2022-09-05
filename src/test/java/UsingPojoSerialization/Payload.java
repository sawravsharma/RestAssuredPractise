package UsingPojoSerialization;

public class Payload {

    String summary;
    String description;
    IssueType issueType;
    Projects projects;

    public Payload(String summary, String description, IssueType issueType, Projects projects){
        this.summary = summary;
        this.description = description;
        this.issueType = issueType;
        this.projects = projects;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IssueType getIssueType() {
        return issueType;
    }

    public void setIssueType(IssueType issueType) {
        this.issueType = issueType;
    }

    public Projects getProjects() {
        return projects;
    }

    public void setProjects(Projects projects) {
        this.projects = projects;
    }
}
