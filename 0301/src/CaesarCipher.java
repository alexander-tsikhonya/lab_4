
public class CaesarCipher{
    private String abc;
    public CaesarCipher(){
      abc= "�����Ũ��������������������������";
  }
  public Char shiftLetter(�har letter, int shift){
   //TODO
   return "";
  }
  public String encoder(String text, int shift){
   phrase= phrase.toLowerCase();
    string result ="";
    for(int i=0;i<phrase.length();i++){
     int index = abc.indexOf(phrase.charAt(i));
     if (index !=-1){
       result +=abc.charAt(index+key);
     }
    } 
   return result;
  }
}