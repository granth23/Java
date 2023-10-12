class Students implements Comparable<Students>{

    int rollno;
    String name;

    Students(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

    public String toString(){
        return "Roll No: " + this.rollno + " Name: " + this.name;
    }

    public boolean equals(Object obj){
        Students s = (Students) obj;
        return this.rollno == s.rollno;
    }

    public int hashCode(){
        return rollno;
    }

    public int compareTo(Students s){
        return this.rollno - s.rollno;
    }
}