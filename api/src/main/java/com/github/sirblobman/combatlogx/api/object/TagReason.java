package com.github.sirblobman.combatlogx.api.object;

public enum TagReason {
    /** Unknown reason for being tagged */
    UNKNOWN,

    /** The player was damaged by an enemy */
    ATTACKED,

    /** The player caused an enemy to take damage */
    ATTACKER;
}