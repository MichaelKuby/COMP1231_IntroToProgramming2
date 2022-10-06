import java.util.ArrayList;
import java.util.Objects;

class Clown
{
    String name;
    int id;

    public Clown(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Uncommnet it, before running the second part of the test. 
    
    @Override
    public boolean equals(Object obj) 
    {
        boolean result = false;
        if (obj == null) 
        {
            result = false;
        }
        if (obj != null) 
        {
            if (this == obj) // check to see if the objects have the same location in memory
            {
                result = true;
            }
            if (getClass() != obj.getClass()) 
            {
                result = false;
            }
        }
        final Clown other = (Clown) obj;
        if (obj != null) 
        {
            if (Objects.equals(this.name, other.name) && Objects.equals(this.id, other.id)) // check to see if they have the same attributes
                result = true;
            else
                result = false;
        }
        return result;
    }

    @Override
    public String toString() 
    {
        return "Clown{" + "name=" + name + ", id=" + id + "}";
    }
    
    
}