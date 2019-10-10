import React from 'react';
import styles from './Footer.scss';
import classNames from 'classnames/bind';

const cx = classNames.bind(styles);

const Footer = () => (
  <footer className={cx('footer')}>
    <div className={cx('content')}>© 2019 Copyright - Mobilskys</div>
  </footer>
);

export default Footer;