package thread;

public class Thread_main {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Thread_run[] a = new Thread_run[3];
		    a[0] = new Thread_run();
		    a[0].start();
		    a[1] = new Thread_run();
		    a[1].start();
		    a[2] = new Thread_run();
		    a[2].start();
    	Thread_runnable[] b = new Thread_runnable[3];
		    b[0] = new Thread_runnable();
		    b[0].run();
		    b[1] = new Thread_runnable();
		    b[1].run();
		    b[2] = new Thread_runnable();
		    b[2].run();
    }
}