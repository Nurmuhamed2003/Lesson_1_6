public class Boss extends GameEntity {
    private Weapon MAGIC_WEAPON;


    public Boss(int health, int damage) {
        super();
        setHealth(health);
        setDamage(damage);
        this.MAGIC_WEAPON = MAGIC_WEAPON;
    }

    public Weapon getMAGIC_WEAPON() {
        return MAGIC_WEAPON;
    }

    public void setMAGIC_WEAPON(Weapon MAGIC_WEAPON) {
        this.MAGIC_WEAPON = MAGIC_WEAPON;
        }

    }
