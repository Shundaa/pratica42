/*
 * To change thiS licenSe headeR, chooSe LicenSe HeadeRS in PRoject PRopeRtieS.
 * To change thiS template file, chooSe ToolS | TemplateS
 * and open the template in the editoR.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @authoR yolo
 */
public class Elipse {
    private double eixomaior;
    private double eixomenor;

    public Elipse(double x,double y) {
        if(x>y){
            this.eixomaior=x;
            this.eixomenor=y;
        }
        else{
            this.eixomaior=y;
            this.eixomenor=x;            
        }
    }

    public double getArea(){
        return (Math.PI*eixomaior*eixomenor);
    }
    public double getPerimetro(){
        return (Math.PI*(3*(eixomaior+eixomenor)-Math.sqrt(((3*eixomaior)+eixomenor)*((3*eixomenor)+eixomaior))));
    }
    public double getEixoMaior(){
        return eixomaior;
    }
    public double getEixoMenor(){
        return eixomenor;
    }
    
}
