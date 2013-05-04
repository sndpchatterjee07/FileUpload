package servlets;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;

import utility.MyForm;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MyServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		MyForm myForm = new MyForm(); // Prepare bean.
		
		// Process request.
        
		//process(request, myForm);
		
		FileItemFactory factory = new DiskFileItemFactory();
		
		ServletFileUpload upload = new ServletFileUpload(factory);
		
		List<FileItem> items = null;
		
		for (FileItem item : items) {
			
			if (item.isFormField()) {
                
				// Process regular form field (input type="text|radio|checkbox|etc", select, etc).
                
				String fieldname = item.getFieldName();
                
                String fieldvalue = item.getString();
                
                // ... (do your job here)
                
                System.out.print(fieldname + " -> " + fieldvalue);
                
            } else {
            	
            	System.out.println("else part...");
                
            	// Process form file field (input type="file").
                
            	String fieldname = item.getFieldName();
                
                String filename = FilenameUtils.getName(item.getName());
                
                InputStream filecontent = item.getInputStream();
                
                // ... (do your job here)
            }
			
		}
		
	}

	/*private void process(HttpServletRequest request, MyForm myForm) {
		// TODO Auto-generated method stub
		
		// Validate file.
        Object fileObject = request.getAttribute("file");
		
		if (!myForm.hasErrors()) {
			
			FileItem fileItem = (FileItem) fileObject;
			
			String fileName = FilenameUtils.getName(fileItem.getName());
			
			System.out.println(fileName);
		}
	}*/

}
