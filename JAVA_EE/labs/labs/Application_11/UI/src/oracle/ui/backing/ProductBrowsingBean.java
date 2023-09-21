package oracle.ui.backing;

import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;

import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.data.RichTree;

import oracle.adf.view.rich.component.rich.layout.RichPanelAccordion;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.layout.RichPanelSplitter;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;
import oracle.adf.view.rich.component.rich.output.RichOutputText;

import oracle.model.Category;

import oracle.model.Product;

import oracle.services.SessionEJB11Local;

import org.apache.myfaces.trinidad.model.ChildPropertyTreeModel;
import org.apache.myfaces.trinidad.model.TreeModel;

public class ProductBrowsingBean {
    
    private TreeModel treemodel;
    private RichForm f1;
    private RichDocument d1;
    private RichTree cateogryTree;
    private RichOutputText ot1;
    private RichPanelSplitter ps1;
    private RichPanelAccordion pa1;
    private RichShowDetailItem sdi1;
    private RichPanelGroupLayout pgl1;
    private RichPanelHeader ph1;
    private RichTable productsTable;

    public ProductBrowsingBean() {
        
    }
    
    public SessionEJB11Local getSessionBean() throws NamingException {
        
        InitialContext ic= new InitialContext();
        Object lookupObject = ic.lookup("java:comp/env/ejb/local/SessionEJB11");
        return(SessionEJB11Local)lookupObject;
    }

    public TreeModel getTreeModel() throws NamingException {
        if(treemodel ==null) {
            
            List<Category>categories = getSessionBean().queryCategoryFindRoot();
            this.treemodel=new ChildPropertyTreeModel(categories, "children");
        }
        return treemodel;
    }

    public List <Product> getAllProducts() throws NamingException{
        
        List<Product> products = this.getSessionBean().queryProductFindAll();
        return products;
    }
    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }

    public void setCateogryTree(RichTree cateogryTree) {
        this.cateogryTree = cateogryTree;
    }

    public RichTree getCateogryTree() {
        return cateogryTree;
    }

    public void setOt1(RichOutputText ot1) {
        this.ot1 = ot1;
    }

    public RichOutputText getOt1() {
        return ot1;
    }

    public void setPs1(RichPanelSplitter ps1) {
        this.ps1 = ps1;
    }

    public RichPanelSplitter getPs1() {
        return ps1;
    }

    public void setPa1(RichPanelAccordion pa1) {
        this.pa1 = pa1;
    }

    public RichPanelAccordion getPa1() {
        return pa1;
    }

    public void setSdi1(RichShowDetailItem sdi1) {
        this.sdi1 = sdi1;
    }

    public RichShowDetailItem getSdi1() {
        return sdi1;
    }

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    public void setPh1(RichPanelHeader ph1) {
        this.ph1 = ph1;
    }

    public RichPanelHeader getPh1() {
        return ph1;
    }


    public void setProductsTable(RichTable t1) {
        this.productsTable = t1;
    }

    public RichTable getProductsTable() {
        return productsTable;
    }
}
