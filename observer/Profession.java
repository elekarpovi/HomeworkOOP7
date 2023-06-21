package observer;

public enum Profession {
    JUNIOR("Junior"),
    MIDDLE("Middle"),
    SENIOR("Senior");
    private String professionName;
    Profession(String professionName){
        this.professionName = professionName;
    }

    @Override
    public String toString(){
        return professionName;
    }

}
