package application;

import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Mainapp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do departamento: ");
		String dpartName = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		int dia = Integer.parseInt(sc.nextLine());
		System.out.print("Email: ");
		String mail = sc.nextLine();
		System.out.print("Telefone: ");
		String tel = sc.nextLine();
		System.out.print("Quantos funcionários tem o departamento? ");
		int qtdFun = Integer.parseInt(sc.nextLine());
		
		Department dpt = new Department(dpartName, dia, new Address(mail, tel));
		
		for(int i = 0; i < qtdFun; i++) {
			System.out.printf("Dados do funcionário %d:\n",(i+1));
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			Double sal = Double.parseDouble(sc.nextLine());
			Employee employee = new Employee(nome, sal);
			
			dpt.addEmployee(employee);
			
		}
		
		showReport(dpt);
		
		sc.close();
	}
	
	public static void showReport(Department dept) {
		System.out.println("FOLHA DE PAGAMENTO:");
		System.out.print("Departamento "+dept.getName()+" R$ "+dept.payRoll()+"\nPagamento realizado no dia: "+dept.getPayDay());
		System.out.print("\nFuncionarios: \n");
		
		for (int i=0; i<dept.getEmployees().size();i++) {
			System.out.println(dept.getEmployees().get(i).getNam());
		}
		
		System.out.println("Para dúvidas favor entrar em contato: "+dept.getContact().getEmail());
		
	}

}
