public class Theater extends Movie {
    private int theaterNo;

    Theater(String id, String name, Director director, int theaterNO){
        super(id,name,director);
        this.theaterNo = theaterNO;
    }
    Theater(){
        this.theaterNo = 0;
    }
    public String getTheaterName() {
        if(theaterNo  >=1&& theaterNo<=11) {
            return "Basic Theater" ;
        }
        else if(theaterNo>=12 && theaterNo<=14) {
            return  "Sweet Theater";
        }
        else if (theaterNo == 15) {
            return "Premium Theater";
        }
        else {
            return null;
        }
    }
    public String toSring() {
        return getTheaterName()+": "+super.toString();
    }

}
