package icrementDecrementNumbers;

public class icrementDecrementQuiz {
	
	public static int largestofthreenumbers (int i, int j, int k) {
		
		if (i>j && i>k) {
		return i;
		}
		else if(j>i && j>k) {
		return j;
		}
		else
		return k;
	}
	
	public static int largestoffournumbers (int i, int j, int k, int l) {
		
		if (i>j && i>k && i> l) {
		return i;
		}
		else if(j>i && j>k && j>l) {
		return j;
		}
		else if (k>i && k>j && k>l) {
		return k;
		}
		else
		return l;	
	}
	
	public static void positivenegativenumber (int a) {
		if(a<0) {
			System.out.println("negative number");
		}
			else
			System.out.println("positive number");
		}
	
	public static void vowelorconsonant (char ch) {
		
		switch(ch){
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		System.out.println("It is a Vowel");
		break;
		default: 
		System.out.println("It is a Consonant");
		break;
		}
	}

	public static void testenvironment(String env) {
		switch (env.toUpperCase()) {
		case "QA": 
		System.out.println("Environment is QA");
		break;
		case "STAGE":
		System.out.println("Environment is Stage");
		break;
		case "DEV":
			System.out.println("Environment is Dev");
			break;
		case "UAT":
			System.out.println("Environment is UAT");
			break;
		case "PROD":
			System.out.println("Environment is Prod");
			break;
		default:
			System.out.println("Please select the right environment");
		}
	}
	
	public static void uberapp (String cartype) {
		switch(cartype.toLowerCase()) {
		case "mini":
			System.out.println("Car Type is Mini");
			break;
		case "sedan":
			System.out.println("Car Type is Sedan");
			break;
		case "suv":
			System.out.println("Car Type is SUV");
			break;
		case "premium":
			System.out.println("Car Type is Premium");
			break;
		default:
			System.out.println("Please select the right car type");
			
		}
	}
	
	public static void main(String[] args) {
		
		int largestofthreenummbers = largestofthreenumbers(10, 20, 30);
		System.out.println(largestofthreenummbers);
		
		int largestoffournummbers = largestoffournumbers(10, 30, 50, 40);
		System.out.println(largestoffournummbers);
		
		positivenegativenumber(0);
		uberapp("MINI");
		vowelorconsonant('a');
		testenvironment("qa");
	}
}

//		int i = 11;
//		i = i++ + ++i;
//		//i = ++i;
//		
//		System.out.println(i);
		
//		int i=0;
//		i = i++ - --i + ++i - i--;
//		System.out.println(i);
		
//		int i = 1;
//		int j = 2;
//		int k = 3;
//		int m = i-- -j-- - k--;
//		System.out.println(i);
//		System.out.println(j);
//		System.out.println(k);
//		System.out.println(m);
//		
//		int a = 1;
//		int b = 2;
//		System.out.println(--b - ++a + ++b - --a);
		
//		int i = 19;
//		int j = 29;
//		int k = 0;
//		int m  = i-- -j-- -k--;
//		
//		System.out.println(i);
//		System.out.println(j);
//		System.out.println(k);
//		System.out.println(m);
//		
//		int i = 'A';
//		//int j = --(--i);
//		System.out.println(i);
//		int i = 10;
//		long j = 15l;
//		double k = 20.00;
//		
//		double doublefromint = i;
//		System.out.println(i);
//		System.out.println(doublefromint);
//		
//		int intfromlong = (int) j;
//		System.out.println(j);
//		System.out.println(intfromlong);
		
