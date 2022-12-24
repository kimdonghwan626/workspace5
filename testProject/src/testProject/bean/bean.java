package testProject.bean;

import bxm.container.annotation.BxmBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import bxm.common.annotaion.BxmCategory;

/**
 * <b>BXM Business class</b>
 * <p>
 * <b>Revision history</b><br>
 * <pre>
 * 2022.12.24 : New creation
 * </pre>
 *
 * @since 2022.12.24
 * @version 1.0.0
 * @author sysadmin
 */
@BxmBean
@BxmCategory(logicalName = "bean", author = "sysadmin")
public class bean {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
}

