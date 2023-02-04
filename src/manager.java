import java.util.ArrayList;

public class manager extends staff{
    static int Id_generator = 10;
    ArrayList<Job_applicants> qualified_applicants = new ArrayList<>();
    ArrayList<cashier> cashierList = new ArrayList<>();

    public manager(){}
    public manager(String Manager_Id,String Manager_name,int age){
        super(Manager_Id,Manager_name,age);
    }
    public void setQualified_applicants(){
        boolean flag;
        for(Job_applicants a: applicantList){
            flag = (a.age > 17 && a.age < 36)? true:false;
           if(flag == true && a.years_of_experience > 1){
//               System.out.println(a.age);
//               System.out.println(a.applicant_name);
//               System.out.println(a.applicant_id);
//               System.out.println(a.years_of_experience);
               qualified_applicants.add(a);

           }
        }
    }
    public void hireCashier(String qualified_applicant_id){
        for(Job_applicants a: qualified_applicants){
            if(a.applicant_id.equalsIgnoreCase(qualified_applicant_id)){
                cashierList.add(new cashier(String.valueOf(Id_generator),a.applicant_name,a.age));
                Id_generator++;
            }
        }
    }
    public void check(){
        for(cashier a: cashierList){
            System.out.println(a.age);
            System.out.println(a.staff_id);
            System.out.println(a.staff_name);
        }
    }

}
