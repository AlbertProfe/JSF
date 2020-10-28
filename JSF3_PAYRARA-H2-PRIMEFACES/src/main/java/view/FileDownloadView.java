package view;


import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

@Named
@RequestScoped
public class FileDownloadView {
 
    private StreamedContent file;
 
    public FileDownloadView() {
        file = DefaultStreamedContent.builder()
                .name("java-server-faces.jpg")
                .contentType("image/jpg")
                .stream(() -> FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("/resources/images/java-server-faces.jpg"))
                .build();
    }
 
    public StreamedContent getFile() {
        return file;
    }
}