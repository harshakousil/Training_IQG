
package cards;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cards package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListDeckIds_QNAME = new QName("http://ejbs/", "listDeckIds");
    private final static QName _GetDeckResponse_QNAME = new QName("http://ejbs/", "getDeckResponse");
    private final static QName _ShuffleDeck_QNAME = new QName("http://ejbs/", "shuffleDeck");
    private final static QName _DeleteDeck_QNAME = new QName("http://ejbs/", "deleteDeck");
    private final static QName _CreateDeck_QNAME = new QName("http://ejbs/", "createDeck");
    private final static QName _GetDeck_QNAME = new QName("http://ejbs/", "getDeck");
    private final static QName _DeleteDeckResponse_QNAME = new QName("http://ejbs/", "deleteDeckResponse");
    private final static QName _Stack_QNAME = new QName("urn:dukesdecks", "stack");
    private final static QName _CreateDeckResponse_QNAME = new QName("http://ejbs/", "createDeckResponse");
    private final static QName _ListDeckIdsResponse_QNAME = new QName("http://ejbs/", "listDeckIdsResponse");
    private final static QName _ShuffleDeckResponse_QNAME = new QName("http://ejbs/", "shuffleDeckResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cards
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateDeck }
     * 
     */
    public CreateDeck createCreateDeck() {
        return new CreateDeck();
    }

    /**
     * Create an instance of {@link GetDeck }
     * 
     */
    public GetDeck createGetDeck() {
        return new GetDeck();
    }

    /**
     * Create an instance of {@link DeleteDeck }
     * 
     */
    public DeleteDeck createDeleteDeck() {
        return new DeleteDeck();
    }

    /**
     * Create an instance of {@link GetDeckResponse }
     * 
     */
    public GetDeckResponse createGetDeckResponse() {
        return new GetDeckResponse();
    }

    /**
     * Create an instance of {@link ShuffleDeck }
     * 
     */
    public ShuffleDeck createShuffleDeck() {
        return new ShuffleDeck();
    }

    /**
     * Create an instance of {@link ListDeckIds }
     * 
     */
    public ListDeckIds createListDeckIds() {
        return new ListDeckIds();
    }

    /**
     * Create an instance of {@link ShuffleDeckResponse }
     * 
     */
    public ShuffleDeckResponse createShuffleDeckResponse() {
        return new ShuffleDeckResponse();
    }

    /**
     * Create an instance of {@link CreateDeckResponse }
     * 
     */
    public CreateDeckResponse createCreateDeckResponse() {
        return new CreateDeckResponse();
    }

    /**
     * Create an instance of {@link ListDeckIdsResponse }
     * 
     */
    public ListDeckIdsResponse createListDeckIdsResponse() {
        return new ListDeckIdsResponse();
    }

    /**
     * Create an instance of {@link DeleteDeckResponse }
     * 
     */
    public DeleteDeckResponse createDeleteDeckResponse() {
        return new DeleteDeckResponse();
    }

    /**
     * Create an instance of {@link StackType }
     * 
     */
    public StackType createStackType() {
        return new StackType();
    }

    /**
     * Create an instance of {@link CardType }
     * 
     */
    public CardType createCardType() {
        return new CardType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListDeckIds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbs/", name = "listDeckIds")
    public JAXBElement<ListDeckIds> createListDeckIds(ListDeckIds value) {
        return new JAXBElement<ListDeckIds>(_ListDeckIds_QNAME, ListDeckIds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeckResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbs/", name = "getDeckResponse")
    public JAXBElement<GetDeckResponse> createGetDeckResponse(GetDeckResponse value) {
        return new JAXBElement<GetDeckResponse>(_GetDeckResponse_QNAME, GetDeckResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShuffleDeck }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbs/", name = "shuffleDeck")
    public JAXBElement<ShuffleDeck> createShuffleDeck(ShuffleDeck value) {
        return new JAXBElement<ShuffleDeck>(_ShuffleDeck_QNAME, ShuffleDeck.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDeck }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbs/", name = "deleteDeck")
    public JAXBElement<DeleteDeck> createDeleteDeck(DeleteDeck value) {
        return new JAXBElement<DeleteDeck>(_DeleteDeck_QNAME, DeleteDeck.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDeck }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbs/", name = "createDeck")
    public JAXBElement<CreateDeck> createCreateDeck(CreateDeck value) {
        return new JAXBElement<CreateDeck>(_CreateDeck_QNAME, CreateDeck.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeck }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbs/", name = "getDeck")
    public JAXBElement<GetDeck> createGetDeck(GetDeck value) {
        return new JAXBElement<GetDeck>(_GetDeck_QNAME, GetDeck.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDeckResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbs/", name = "deleteDeckResponse")
    public JAXBElement<DeleteDeckResponse> createDeleteDeckResponse(DeleteDeckResponse value) {
        return new JAXBElement<DeleteDeckResponse>(_DeleteDeckResponse_QNAME, DeleteDeckResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StackType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dukesdecks", name = "stack")
    public JAXBElement<StackType> createStack(StackType value) {
        return new JAXBElement<StackType>(_Stack_QNAME, StackType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDeckResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbs/", name = "createDeckResponse")
    public JAXBElement<CreateDeckResponse> createCreateDeckResponse(CreateDeckResponse value) {
        return new JAXBElement<CreateDeckResponse>(_CreateDeckResponse_QNAME, CreateDeckResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListDeckIdsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbs/", name = "listDeckIdsResponse")
    public JAXBElement<ListDeckIdsResponse> createListDeckIdsResponse(ListDeckIdsResponse value) {
        return new JAXBElement<ListDeckIdsResponse>(_ListDeckIdsResponse_QNAME, ListDeckIdsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShuffleDeckResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbs/", name = "shuffleDeckResponse")
    public JAXBElement<ShuffleDeckResponse> createShuffleDeckResponse(ShuffleDeckResponse value) {
        return new JAXBElement<ShuffleDeckResponse>(_ShuffleDeckResponse_QNAME, ShuffleDeckResponse.class, null, value);
    }

}
