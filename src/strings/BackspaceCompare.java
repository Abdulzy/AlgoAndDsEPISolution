package strings;

public class BackspaceCompare {
  public boolean backspaceCompare(String s, String t) {
    int sL = s.length()-1;
    int tL = t.length()-1;
    String sW = "";
    String tW = "";
    int sHash = 0;
    int tHash = 0;

    while(sL >= 0 || tL>= 0){

      if(sL >= 0){
        if(s.charAt(sL) == '#'){
          sHash++;
        }
        else{
          if(sHash > 0){
            sHash--;
          }else{
            sW = s.charAt(sL) + sW;
          }
        }
      }

      if(tL >= 0){
        if(t.charAt(tL) == '#'){
          tHash++;
        }
        else{
          if(tHash > 0){
            tHash--;
          }else{
            tW = t.charAt(tL) + tW;
          }
        }
      }

      sL--;
      tL--;
    }
    return sW.equals(tW);
  }
  public boolean bCompare(String S, String T) {
    int i = S.length() - 1, j = T.length() - 1;
    int skipS = 0, skipT = 0;

    while (i >= 0 || j >= 0) { // While there may be chars in build(S) or build (T)
      while (i >= 0) { // Find position of next possible char in build(S)
        if (S.charAt(i) == '#') {skipS++; i--;}
        else if (skipS > 0) {skipS--; i--;}
        else break;
      }
      while (j >= 0) { // Find position of next possible char in build(T)
        if (T.charAt(j) == '#') {skipT++; j--;}
        else if (skipT > 0) {skipT--; j--;}
        else break;
      }
      // If two actual characters are different
      if (i >= 0 && j >= 0 && S.charAt(i) != T.charAt(j))
        return false;
      // If expecting to compare char vs nothing
      if ((i >= 0) != (j >= 0))
        return false;
      i--; j--;
    }
    return true;
  }
}
