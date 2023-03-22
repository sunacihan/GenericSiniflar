public class MyList<s1,s2,s3>{
    private s1 suna1;
    private s2 suna2;
    private s3 suna3;

    public MyList(s1 suna1, s2 suna2, s3 suna3) {
        this.suna1 = suna1;
        this.suna2 = suna2;
        this.suna3 = suna3;
    }

    public s1 getSuna1() {
        return suna1;
    }

    public void setSuna1(s1 suna1) {
        this.suna1 = suna1;
    }

    public s2 getSuna2() {
        return suna2;
    }

    public void setSuna2(s2 suna2) {
        this.suna2 = suna2;
    }

    public s3 getSuna3() {
        return suna3;
    }

    public void setSuna3(s3 suna3) {
        this.suna3 = suna3;
    }
    public void showInfo(){
        System.out.println("s1 :"+suna1.getClass().getSimpleName());
        System.out.println("s2 :"+suna2.getClass().getSimpleName());
        System.out.println("s3 :"+suna3.getClass().getSimpleName());
    }
}
