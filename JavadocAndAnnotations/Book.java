/**
 * @author Varun Reddy
 * @version 2.0
 * @since 2015
 **/

package JavadocAndAnnotations;

/**
 * Class for Library Book
 */

public class Book {
    /**
     * @value Default value 10
     */
    static int val=10;

    /**
     * Parameterized Constructor
     * @param s Book name
     */
    public Book(String s){}

    /**
     * Issue a book to a student
     * @param roll  Roll No of a student
     * @throws Exception If book is not available throw Exception
     */
    public void issue(int roll) throws Exception{}

    /**
     * Check if Book is available or not
     * @param str Book name
     * @return Returns true if book is available, else false
     */
    public boolean available(String str){
        return true;
    }


    /**
     * Get book name using book id
     * @param id Book Id
     * @return Returns book name associated with the id
     */
    public String getName(int id){
        return "";
    }
}
