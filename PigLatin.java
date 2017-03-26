public class PigLatin{
	public static void main(String[] args){
		String g= "a";
		String h= "b";
		String j= "asd";
		translate(g);
		translate(h);
		translate(j);
	}
	public static String translate(String original){
		String x = original.toLowerCase();
		String temp;
		if (x.charAt(0)=='a'||x.charAt(0)=='e'||x.charAt(0)=='i'||x.charAt(0)=='o'||x.charAt(0)=='u'){
			temp = x + "way";
			System.out.println(temp);
		} else {
			temp = x.substring(1,x.length())+x.charAt(0)+"ay";
			System.out.println(temp);
		}
		
		return temp;
	}
}