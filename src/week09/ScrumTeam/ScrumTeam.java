package week09.ScrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

            /*3. create a class called ScrumTeam
           	Attributes:
                  PO, BA, SM (for storing their names ONLY)
                  testers, developers, daysOfSprint

            Add a constructor that can set the PO, BA, SM and daysOfSprint

         	Actions:
                addTester(Tester tester): adds the given tester to the testers ArrayList

                addTesters(Tester[] testers): adds the given testers to the testers ArrayList

                addDeveloper(Developer developer): adds the given developer to the developers ArrayList

                addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList

                removeTester(long employeeID): removes the given tester from the testers ArrayList

                removeDeveloper(long employeeID): removes the developer from the developers ArrayList

                toString(): prints number of tester,& developers,  PO name, SM name, BA name, and daysOfSprint*/
public class ScrumTeam {

    public String PO, BA, SM;
    public int daysOfSprint;

    public ArrayList<Developer> developers;
    public ArrayList<Tester> testers;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
        testers = new ArrayList<>();
        developers = new ArrayList<>();
    }

    // add tester and add testers functionality
    public void addTester(Tester tester){
        testers.add(tester);
    }

    public void addTesters(Tester [] testers){
        this.testers.addAll(Arrays.asList(testers));
    }

    // add developer and add developers functionality
    public void addDeveloper(Developer developer){
        this.developers.add(developer);
    }

    public void addDevelopers(Developer [] developers){
        this.developers.addAll(Arrays.asList(developers));
    }

    public void removeTester(String employeeID){
        testers.removeIf(p->p.employeeID == employeeID);
    }

    public void removeDeveloper(String employeeID){
        developers.removeIf(p->p.employeeID == employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "NumberOfTesters='" + testers.size() + '\'' +
                "NumberOfDevelopers='" + developers.size() + '\'' +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
