public class GenerateSentence {
    public static void main(String[] args) {
        String sub[] = {"I", "You"};
        String verbs[]={"Play", "Love"};
        String objects[]={"Hockey","Football"};
        for (int i=0;i< sub.length;i++){
            for(int j=0;j< verbs.length;j++){
                for (int k=0;k< objects.length;k++){
                    System.out.println(sub[i]+" "+verbs[j]+" "+objects[k]);
                }
            }
        }
    }
}
