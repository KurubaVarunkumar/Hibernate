package SecondLevelCache.SecondLevelCache;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
@Table(name = "product")
@Cacheable
@Cache(usage =CacheConcurrencyStrategy.READ_ONLY)
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;

    @Column(name="name")
    String name;

    @ManyToOne
    Category category;
    

    public Category getCategory() {
		return category;
	}




	public void setCategory(Category category) {
		this.category = category;
	}




	public Product() {
        // TODO Auto-generated constructor stub
    }




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+name;
	}

}

