// createing a thread -- runnable -- overload

// package threads;

// class creating implements Runnable{
//         public void run(){
//             System.out.println("thread is running... ");
//         }
       
//             public static void main(String args[]) {
//                 creating m1 = new creating();
//                 Thread t1 = new Thread(m1); // Corrected line
//                 t1.start();
//             }
            
//         }
    
    
// another way to create a thread.--override 

package threads;

class creating extends Thread{
        public void run(){
            System.out.println("thread is running... ");
        }
       
            public static void main(String args[]) {
                creating m1 = new creating();
              
                m1.start();
            }
            
        }

        
    
    