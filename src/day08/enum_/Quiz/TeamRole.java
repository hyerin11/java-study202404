package day08.enum_.Quiz;

// TeamRole enum: 팀원의 역할을 정의하고 각 역할에 따른 설명을 제공
public enum TeamRole {
    LEADER("Manages the team and coordinates."),
    DEVELOPER("Develops the software."),
    DESIGNER("Designs the user interface."),
    TESTER("Tests the software for bugs.");

    private final String description;

    TeamRole(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
