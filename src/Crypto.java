public class Crypto {

        static protected String Cesar(String m, int k) {
            StringBuilder risultato = new StringBuilder(m.length());
            for (char singleChar : m.toCharArray()) {
                int shiftedChar = (int) (singleChar + k) % 256;
                risultato.append((char) shiftedChar);
                
            }
            return risultato.toString();
        }
    
        static protected String xorAlgo(String m, String k) {

            StringBuilder result = new StringBuilder();
    
            for (int i = 0; i < m.length(); i++) {
                char inputChar=m.charAt(i);
               char  keyChar=k.charAt(i % k.length());
                char encryptedChar=(char) (inputChar ^ keyChar);
                result.append(encryptedChar);
            }
            return result.toString();
        }
        
    }
