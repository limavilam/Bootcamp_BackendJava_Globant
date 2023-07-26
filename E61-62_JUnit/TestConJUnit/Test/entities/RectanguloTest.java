package entities;

import org.junit.jupiter.api.*;
import services.RectanguloService;

import static org.junit.jupiter.api.Assertions.*;

class RectanguloTest {

    public RectanguloTest() {
    }

    RectanguloService rs;


    @AfterEach
    void tearDown() {

    }

    @BeforeEach
    void setUp() {
        rs = new RectanguloService(); //Antes de ejecutarse cada test se inicialice eso.

    }

    @BeforeAll
    static void beforeAll() {

    }

    @AfterAll
    static void afterAll() {

    }

    @Test  //Se debe colocar el test
    public void deberiaInicializarConColor(){
        assertNotNull(new Rectangulo(10,10).getColor());
    }

    @Test
    public void deberiaCalcularArea(){
        assertEquals(100, rs.calcularArea(new Rectangulo(10,10)),0);
        assertEquals(20, rs.calcularArea(new Rectangulo(4,5)),0);
        assertEquals(1, rs.calcularArea(new Rectangulo(1,1)),0);

    }
}