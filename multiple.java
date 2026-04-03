
interface LoanService{
    void applyloan();
}

interface InsurenceService{
    void Insurence();
}

class Banks implements LoanService,InsurenceService{
    public void applyloan(){
        System.out.println("Loan Applied");
    }
    public void Insurence(){
        System.out.println("Insurence Applied");
    }
}

public class multiple{
    public static void main(String[] args) {
        Banks b = new Banks();
        b.applyloan();
        b.Insurence();
    }
}