/**
 * The Zeffit is a character whose purpose is to attack Groks and eliminate them.
 * When Zeffits take a hit, they turn green.  When they take a second hit, Zeffits turn blue.
 * When they take a third hit, Zeffits turn red.  The fourth hit makes them explode in a fiery
 * death!
 *
 * @author (you)
 * @version (a version number or a date)
 */
public class Zeffit
{int hits = 0;
    private static final int green = 1;
    private static final int blue = 2;

    private static final int red = 3;
    private static final int X_PLODE = 4;
    private static final int hitFree = 0;
    int cs;
    /**
     * Constructor for objects of class Zeffit
     */
    public Zeffit()
    {cs = hitFree;

    }

    /**
     * Inflicts or registers a hit on this Zeffit.
     *
     */
    public void takesHit()
    {
        hits++;
        if (cs == hitFree){
            cs = green;
        } else if (cs == green) {
            cs = blue;

        } else if (cs == blue) {
            cs = red;

        } else if (cs == red) {
            cs = X_PLODE;

        }
    }

    /**
     * Indicates whether this Zeffit has taken no hits
     *
     * @return    true if this Zeffit has taken no hits; false otherwise.
     */
    public boolean isHitFree()
    {  boolean isHitFree = false;
        if (cs == hitFree){
            isHitFree = true;

    }
        return isHitFree;
    }

    /**
     * Indicates whether this Zeffit has taken a hit
     *
     * @return    true if this Zeffit has taken a hit; false otherwise.
     */
    public boolean isGreen()
    {boolean isGreen = false;
        if (cs == green){
        isGreen = true;}
        return isGreen;
    }

    /**
     * Indicates whether this Zeffit has taken two hits
     *
     * @return    true if this Zeffit has taken two hits; false otherwise.
     */
    public boolean isBlue()
    {boolean isBlue = false;
       if (cs == blue){
           isBlue = true;
       }
        return isBlue;
    }

    /**
     * Indicates whether this Zeffit has taken three hits
     *
     * @return    true if this Zeffit has taken three hits; false otherwise.
     */
    public boolean isRed()
    {boolean isRed = false;
        if (cs == red){
            isRed = true;
        }
       return isRed;
    }

    /**
     * Indicates whether this Zeffit has exploded in a fiery death!
     *
     * @return    true if this Zeffit is dead; false otherwise.
     */
    public boolean isDead()
    {boolean isUnAlive = false;
        if (cs == X_PLODE){
            isUnAlive = true;
        }
            return isUnAlive;
    }
}

