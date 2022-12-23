/**
 * DBIO 에디터에서 생성된 파일입니다. 인터페이스 파일을 직접 수정하지 마십시오.
 * @Generated Fri Dec 23 22:02:56 KST 2022
 */
package testProject.dbio;

import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmDataAccess;

/**
 */
@SuppressWarnings({ "all" })
@BxmDataAccess(mapper = "testProject/dbio/dbio.dbio", datasource = "MainDS")
@BxmCategory(logicalName = "dbio", author = "sysadmin")
public interface dbio
{

	@BxmCategory(author = "TestAuthor")
	testProject.io.Io selectOne();
}