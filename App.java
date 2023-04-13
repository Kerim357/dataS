package task2;

public class App {

    public static void Main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        System.out.println("Enter '1' to input expressions manually or '2' to input file path: ");
        int choice = scanner.nextInt();
        ArrayList<Double> results = new ArrayList<Double>();
        switch(choice) {
            case 1:
                scanner.nextLine();
                System.out.println("Enter expressions separated by spaces:");
                String expressionStr = scanner.nextLine();
                String[] expressions = expressionStr.split("\\s+");
                for (String expression : expressions) {
                    Double result = calculate(expression);
                    results.add(result);
                }
                break;
            case 2:
                scanner.nextLine();
                System.out.println("Enter file path:");
                String filePath = scanner.nextLine();
                try {
                    ArrayList<String> expressionsFromFile = readFile(filePath);
                    for (String expression : expressionsFromFile) {
                        Double result = calculate(expression);
                        results.add(result);
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("File not found.");
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }

        for (int i = 0; i < results.size(); i++) {
            System.out.println("Result " + (i+1) + ": " + results.get(i));
        }
    
    }
            
 }


