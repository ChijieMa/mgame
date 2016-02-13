package onight.mgame.chats.cass.entity;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.cassandra.core.Ordering;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import onight.tfw.cass.enums.Indexed;
import onight.tfw.cass.enums.KeyColumn;
import onight.tfw.cass.enums.KeyPart;
import onight.tfw.cass.enums.Table;

@Table(name = "roommessage")
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class RoomMessage {

	@KeyColumn(keyPart = KeyPart.PARTITION, ordinal = 1)
	private String room_id;


//	@KeyColumn(keyPart = KeyPart.CLUSTERING, ordinal = 2, ordering = Ordering.DESCENDING)
	private long insert_timems=System.currentTimeMillis();

	@KeyColumn(keyPart = KeyPart.CLUSTERING, ordinal = 2, ordering = Ordering.DESCENDING)
	private String msg_id;

	@Indexed
	private String from_u;
	
	// @Indexed
	// private String to_u;

	private String msg;

	@Indexed
	private boolean readed = false;

	String audit_user;// 审批员
	String audit_timems;// 审批时间

}