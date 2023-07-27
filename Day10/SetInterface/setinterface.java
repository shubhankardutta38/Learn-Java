/*
 * set interface in java is present in java.util.package.
 * It extends the collection interface
 * it represents the unordered set of elements which doesn't allow us to store the duplicate items
 * we can store at most one null value in set
 */

/*
 * Set can be intantiated as :

 *Set<data type> s1 = new Hasset<data type>();
 *Set<data type> s2 = new LinkedHasset<data type>();
 *Set<data type> s3 = new TreeHasset<data type>();
*/

package SetInterface;

import java.util.*;

public class setinterface { //Test Collection 7 
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("SSD");
        set.add("Ajay");

        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
