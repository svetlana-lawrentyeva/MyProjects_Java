/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds;

/**
 *
 * @author nau
 */
public interface IDS
{
    public boolean Save(PList pl);
    public PList Load();
    public void setFileName(String _fileName);
}
