package adote.com.amor.backend;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;


@Configuration
public class DatabaseConfiguration {
	@Autowired
	private Environment env;

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setUrl(env.getProperty("db.connection.url"));
		dataSource.setDriverClassName(env.getProperty("db.driver.class"));
		dataSource.setUsername(env.getProperty("db.connection.username"));
		dataSource.setPassword(env.getProperty("db.connection.password"));

		return dataSource;
	}

	@Bean
	@Autowired
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource datasource) {
		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		vendorAdapter.setGenerateDdl(true);

		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();

		factory.setJpaDialect(vendorAdapter.getJpaDialect());
		factory.setJpaVendorAdapter(vendorAdapter);
		factory.setDataSource(datasource);
		factory.setPersistenceUnitName("adote-com-amor-pu");
		factory.setPersistenceXmlLocation("classpath:META-INF/persistence.xml");
		factory.afterPropertiesSet();

		return factory;
	}

	@Bean
	@Autowired
	public PlatformTransactionManager transactionManager(EntityManagerFactory entityManager) {
		JpaTransactionManager txManager = new JpaTransactionManager();
		txManager.setEntityManagerFactory(entityManager);

		return txManager;
	}
}
