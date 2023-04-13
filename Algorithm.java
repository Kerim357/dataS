package task2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Algorithm {
    public static Double calculate(String s1) {
    	Scanner scanner=new Scanner(System.in);
        System.out.println("Enter expression: ");
        String expression=scanner.nextLine();
        char[] token= new char[expression.length()];
        int i;
        for( i=0;i<expression.length();i++){
            token[i]=expression.charAt(i);
        }

       for(i=0;i<token.length;i++){
            if      (token[i]=='(') {;}
            else if (token[i]=='+')   {
                operator.push(token[i]);
            }
            else if (token[i]=='-')   {
                operator.push(token[i]);
            }
            else if (token[i]=='*')   {
                operator.push(token[i]);
            }
            else if (token[i]=='/')   {
                operator.push(token[i]);
            }

            else if (token[i]==')') {
                char ope=operator.pop();
                double num=number.pop();
                if(ope=='+') {
                    num=num+number.pop();
                }
                else if(ope=='-') {
                    num=number.pop()-num;
                }
                else if(ope=='*') {
                    num=number.pop()*num;
                }
                else if(ope=='/') {
                    num=number.pop()/num;
                }
                else if(ope=='%') {
                	num=number.pop()%num;
                }
              
                else if(ope=='^') {
                	num=number.pop()^num;
                }
                number.push(num);
            }
            else {
                //int num2=Character.getNumericValue(token[i]);
                double num2=Double.parseDouble(Character.toString(token[i]));
                number.push(num2);
            }


        }
        System.out.println(number.pop());
    }
    }

    public static ArrayList<Double> calculateFromFile(String filePath) throws FileNotFoundException {
    
    	ArrayList<Double> results = new ArrayList<>();
        ArrayList<String> expressions = FileUtils.readFile(filePath);

        for (String s1 : expressions) {
            Double result = evaluate(s1);
            results.add(result);
        }

        return results;
    
    }
}
