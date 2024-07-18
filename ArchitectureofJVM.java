package thirdprogram;

public class ArchitectureofJVM {

	public static void main(String[] args) {
		// 15 lines of Architecture of JVM
		System.out.println("JVM stands for Java Virtual Machine");
		System.out.println("Java is both compiler and interpreter language");
		System.out.println("JVM architecture have 3 components");
		System.out.println("1. Class Loader, 2. Runtime memory/Data area, 3. Execution engine");
		System.out.println("1)Class Loader will load the class");
		System.out.println("It has 3 components i.e., loading, linking, initialization");
		System.out.println("The class loader loades in the main memeory");
		System.out.println("main() method loaded first in main");
		System.out.println("Bootstrap CL is super class of extension class loader");
		System.out.println("It loads standard Java packages");
		System.out.println("Extension CL is subclass of Bootstrap CL");
		System.out.println("It also has Interpreter and JIT compiler");
		System.out.println("2) Runtime memory has 5 components");
		System.out.println("1)Method area, 2)Heap area, 3)Stack area, 4)PC Register, 5)Native Method Stack");
		System.out.println("The Garbage Collector collects and removes unreferenced objects from the heap area");
		
		

	}

}
