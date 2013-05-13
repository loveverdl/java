package shixun.livestreet.service.inter;

import java.util.List;

import shixun.livestreet.db.pojo.Coupon;
import shixun.livestreet.db.pojo.Picture;
import shixun.livestreet.pojo.CommercialDetail;
import shixun.livestreet.pojo.PictureDetail;

public interface CommercialService {

	public void publishCoupon(Coupon coupon);

	public CommercialDetail getDetail(int commercialId);

	public List<PictureDetail> getPictureSetDetail(int pictureSetId);

	/**
	 * 
	 * @param objects
	 *            ������ӵ�����Ϣ<tt>Region</tt>��Ԥ����Ϣ<tt>Budget</tt>�������Ϣ
	 *            <tt>TypeOfCommercial</tt>�� ��ʩ��Ϣ<tt>FacilityNeeded</tt>���ۺ���Ϣ
	 *            <tt>String</tt>
	 * @return
	 */
	public List<CommercialDetail> filterCommercial(Object... objects);
}
