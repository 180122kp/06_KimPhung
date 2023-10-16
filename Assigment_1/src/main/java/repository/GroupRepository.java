package repository;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.vti.Assigment_1.entity.Group;
import com.vti.utils.HibernateUtils;
public class GroupRepository {
	private HibernateUtils hibernateUtils;
	public GroupRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}
	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<Group> getAllGroups() {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<Group> query = session.createQuery("FROM Group");

			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
	public Group getGroupByID(short id)
	{

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// get group by id
			Group group = session.get(Group.class, id);

			return group;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
	@SuppressWarnings({ "unchecked", "deprecation" })
	public Group getGroupByName(String name) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create sql query
			Query<Group> query = session.createQuery("FROM Group WHERE name = :nameParameter");

			// set parameter
			query.setParameter("nameParameter", name);

			// get result
			Group group = query.uniqueResult();

			return group;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
	@SuppressWarnings("deprecation")
	public void createGroup(Group group) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create
			session.save(group);

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
	@SuppressWarnings("deprecation")
	public void updateGroup(short id, String newName) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// get group
			Group group = (Group) session.load(Group.class, id);

			// update
			group.setName(newName);
			
			session.getTransaction().commit();
			
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
	@SuppressWarnings("deprecation")
	public void deleteGroup(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// get group
			Group group = (Group) session.load(Group.class, id);

			// delete
			session.delete(group);

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
	public boolean isGroupExistsByID(short id) {

		// get group
		Group group = getGroupByID(id);

		// return result
		if (group == null) {
			return false;
		}

		return true;
	}

	public boolean isGroupExistsByName(String name) {
		Group group = getGroupByName(name);

		if (group == null) {
			return false;
		}
		return true;
	}
}
