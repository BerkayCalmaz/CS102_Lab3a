/**
 * Author: Berkay Çalmaz
 * Date: 6.11.2020
 */
public interface Selectable {

    public boolean getSelected();
    public void setSelected( boolean bool );
    public Shape contains( int x, int y);

}
