/*
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * @author  Michael Kolling and David J. Barnes
 * @version 1.0 (February 2002)
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class Room
{
    private String description;
    private Room northExit;
    private Room southExit;
    private Room eastExit;
    private Room westExit;
    private HashMap<String, Room> exits;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     */
    public Room(String description) 
    {

        this.description = description;
        exits = new HashMap<>();
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     */
    public void setExits(Room north, Room east, Room south, Room west, Room up, Room down)
    {
        if(north != null)
            exits.put("north",north);
        if(east != null)
            exits.put("east",east);
        if(south != null)
            exits.put("south",south);
        if(west != null)
            exits.put("west",west);
        if(up != null)
            exits.put("up",up);
        if(down != null)
            exits.put("down",down);
    }
    public void setExits(String direction, Room neighbor){

        exits.put(direction, neighbor);
    }


    public Room getExit(String direction) {
        return exits.get(direction);
    }

    /**
     * Return the description of the room (the one that was defined
     * in the constructor).
     */
    public String getDescription()
    {
        return description;
    }

    public String getExitString() {
        String returnString = "Exits:";
        Set keys = exits.keySet();
        for(Iterator iter = keys.iterator(); iter.hasNext(); )
            returnString += " " + iter.next();
        return returnString;
    }
    public Room getNorthExit() {
        return northExit;
    }

    public void setNorthExit(Room northExit) {
        this.northExit = northExit;
    }

    public Room getSouthExit() {
        return southExit;
    }

    public void setSouthExit(Room southExit) {
        this.southExit = southExit;
    }

    public Room getEastExit() {
        return eastExit;
    }

    public void setEastExit(Room eastExit) {
        this.eastExit = eastExit;
    }

    public Room getWestExit() {
        return westExit;
    }

    public void setWestExit(Room westExit) {
        this.westExit = westExit;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
