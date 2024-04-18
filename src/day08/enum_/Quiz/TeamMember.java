package day08.enum_.Quiz;

// TeamMember class: 팀원의 이름과 역할을 관리
class TeamMember {
    private final String name;
    private final TeamRole role;

    public TeamMember(String name, TeamRole role) {
        this.name = name;
        this.role = role;
    }

    public void assignTask() {
        System.out.println(name + " is assigned to " + role.getDescription());
    }
}
