class fibonacci{ b b. b.  b.   
  public static void main(String[]abc){
    int firstTerm=0;
    int secondTerm=1;
    int nextTerm;
    System.out.println(firstTerm);
     System.out.println(secondTerm);
    for(int i=1;i<=10;i++){
      nextTerm=firstTerm+secondTerm;
      System.out.println(nextTerm);
      firstTerm=secondTerm;
      secondTerm=nextTerm;
    }
  }
}
    
